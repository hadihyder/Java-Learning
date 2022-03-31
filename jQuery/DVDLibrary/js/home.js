$(document).ready(function () {
    loadDvds();
    addDvd();
    $('#createDvdButton').on('click', function () {
        showAddForm();
      })
    updateDvd();      
    searchDvd();
});

function loadDvds(){
    $('#errorMessages').empty();
    clearDvdTable();
    var contentRows = $('#contentRows');
    $.ajax({
        type: "GET",
        url: "http://dvd-library.us-east-1.elasticbeanstalk.com/dvds",
        success: function (response) {
            $.each(response, function (index, value) { 
                var title = value.title;
                var releaseYear = value.releaseYear;
                var directorName = value.director;
                var rating = value.rating;
                var notes = value.notes;
                var dvdId = value.id;
                
                var row = '<tr>';
                    row += '<td>' + title + '</td>';
                    row += '<td>' + releaseYear + '</td>';
                    row += '<td>' + directorName + '</td>';
                    row += '<td>' + rating + '</td>';
                    row += '<td><button type="button" class="btn btn-info" onclick="showEditForm(' + dvdId + ')">Edit</button></td>';
                    
                    row += '<td><button type="button" class="btn btn-danger" onClick="deleteDvd('+ dvdId +')">Delete</button></td>';
                    contentRows.append(row);
            });
        }, 
        error: function(){
            $('#errorMessages')
            .append($('<li>'))
            .attr({class: 'list-group-item list-group-item-danger'})
            .text('Error calling web service. Please try again later.')
        }
    });
}

function clearDvdTable() {
    $('#contentRows').empty();
}

function addDvd() {
    $('#errorMessages').empty();
    $('#addButton').click(function (event) {
        var haveValidationErrors = checkAndDisplayValidationErrors($('#addDvdForm').find('input'));
        if(haveValidationErrors){
            return false;
        }

        $.ajax({
            type: "POST",
            url: "http://dvd-library.us-east-1.elasticbeanstalk.com/dvd",
            crossDomain:true,
            data: JSON.stringify({
                title: $('#addTitle').val(),
                releaseYear: $('#addReleaseYear').val(),
                director: $('#addDirectorName').val(),
                rating: $('#addSelectRating').val(),
                notes: $('#addNotes').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-type': 'application/json'
            },
            dataType: "json",
            success: function () {
                $('#errorMessages').empty();
                $('#addTitle').val('');
                $('#addReleaseYear').val('');
                $('#addDirectorName').val('');
                $('#addSelectRating').val('');
                $('#addNotes').val('');

                loadDvds();
            }, 
            error: function () {
                $('#errorMessages')
                .append($('<li>')
                .attr({class: 'list-group-item list-group-item-danger'})
                .text('Error calling web service. Please try again later.')); 
              }
        });
    })
}

function showAddForm() {
    $('#errorMessages').empty();
    $('#addAndSearchContainer, #tableContainer').hide();
    $('#addDvdForm').show();

    
  }



function hideAddForm() {  
    $('#errorMessages').empty();
    $('#addAndSearchContainer, #tableContainer').show();
    $('#addDvdForm').hide();
}

function showEditForm(dvdId) {

    $('#errorMessages').empty();
    
    $.ajax({
        type: 'GET',
        url: 'http://dvd-library.us-east-1.elasticbeanstalk.com/dvd/' + dvdId,
        success: function(data, status) {
            $('#editTitle').val(data.title);
            $('#editReleaseYear').val(data.releaseYear);
            $('#editDirectorName').val(data.director);
            $('#selectRating').val(data.rating);
            $('#editNotes').val(data.notes);
            $('#editDvdId').val(data.id);
            $('#editDvdBanner').text("Edit Dvd: " + data.title);
            
        },
        error: function() {
            $('#errorMessages')
            .append($('<li>')
            .attr({class: 'list-group-item list-group-item-danger'})
            .text('Error calling web service. Please try again later.')); 
        }
    })

    $('#addAndSearchContainer, #tableContainer').hide();
    $('#editDvdForm').show();
}

function hideEditForm () { 
    $('#errorMessages').empty();

    $('#editTitle').val('');
    $('#editReleaseYear').val('');
    $('#editDirectorName').val('');
    $('#editRating').val('');
    $('#editNotes').val('');

    $('#addAndSearchContainer, #tableContainer').show();
    $('#editDvdForm').hide();
 }

function updateDvd(dvdId){
    $('#updateButton').click(function(event) {

        var haveValidationErrors = checkAndDisplayValidationErrors($('#editForm').find('input'));
        if(haveValidationErrors){
          return false;
        }
        $.ajax({
            type: "PUT",
            url: "http://dvd-library.us-east-1.elasticbeanstalk.com/dvd/" + $('#editDvdId').val(),
            data: JSON.stringify({
                title: $('#editTitle').val(),
                releaseYear: $('#editReleaseYear').val(),
                director: $('#editDirectorName').val(),
                rating: $('#selectRating').val(),
                notes: $('#editNotes').val(),
               
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            
            success: function () {
                $('#errorMessages').empty();
                
                hideEditForm();
                loadDvds();
            },
            error: function(e) {
                
                $('#errorMessages')
                    .append($('<li>')
                    .attr({class: 'list-group-item list-group-item-danger'})
                    .text('Error calling web service. Please try again later.')); 
            }
        });
    })
    
}

function deleteDvd(dvdId) {
    
    if(confirm('Are you sure you want to delete this Dvd from your collection?')){
        $.ajax({
            type: "DELETE",
            url: "http://dvd-library.us-east-1.elasticbeanstalk.com/dvd/" + dvdId,
            success: function (response) {
                loadDvds();
            }
        });
    } else {
        return;
    }
}

function checkAndDisplayValidationErrors(input) {
    console.log(input);
    $('#errorMessages').empty();
    
    var errorMessages = [];
    
    input.each(function(i) {
        if (!this.validity.valid) {
            var errorField = $('label[for=' + this.id + ']').text();
            errorMessages.push(errorField + ' ' + this.validationMessage);
        }

        if(i == 0){
            var currVal = $('#' + this.id).val();
            if(currVal.length == ''){
                var errorField = $('label[for=' + this.id + ']').text();
                errorMessages.push(errorField + ' ' + 'Please enter Dvd title');
            }
        }

        if(i == 1) {
            var currVal = $('#' + this.id).val();
            if(currVal.length < 4){
                var errorField = $('label[for=' + this.id + ']').text();
                errorMessages.push(errorField + ' ' + 'Please enter 4 digits.');
            }
            let isnum = /^\d+$/.test(currVal);
            if(!isnum) {
                var errorField = $('label[for=' + this.id + ']').text();
                errorMessages.push(errorField + ' ' + 'Please enter digits only.');
            }
        }
    });


    console.log(errorMessages);
    if (errorMessages.length > 0){
        $.each(errorMessages,function(index,message) {
            $('#errorMessages').append($('<li>').attr({class: 'list-group-item list-group-item-danger'}).text(message));
        });
        // return true, indicating that there were errors
        return true;
    } else {
        // return false, indicating that there were no errors
        return false;
    }
}

function searchDvd(){
    $('#searchButton').on('click', function () {
        var searchCategory = $('#selectCategory').val();
        var searchInput = $('#searchInput').val();    

        var isValid = checkSearchValid(searchCategory, searchInput);
        if(!isValid){
            return false;
        }

        $.ajax({
            type: "GET",
            url: "http://dvd-library.us-east-1.elasticbeanstalk.com/dvds/" + searchCategory + "/" + searchInput,
            
            success: function (response) {
                
                    var dvdTitle = response[0].title;
                    var dvdReleaseYear = response[0].releaseYear;
                    var dvdDirector = response[0].director;
                    var dvdRating = response[0].rating;
                    var dvdNotes = response[0].notes;
                    
    
                    $('#displayTitle').append('<p>' + dvdTitle + '</p>');
                    $('#displayReleaseYear').text(dvdReleaseYear);
                    $('#displayDirector').text(dvdDirector);
                    $('#displayRating').text(dvdRating);
                    $('#displayNotes').text(dvdNotes);
                

                showDisplayInformation();
            },
            error: function(){
                $('#errorMessages')
                .append($('<li>')
                .attr({class: 'list-group-item list-group-item-danger'})
                .text('Error calling web service. Please try again later.'));
            }
        });
      })
}

function showDisplayInformation(){
    $('#addAndSearchContainer, #tableContainer').hide();
    $('#displayInformation').show();

}
function displayBackButton () {
    $('#addAndSearchContainer, #tableContainer').show();
    $('#displayInformation').hide();
  }

function checkSearchValid(searchCategory, searchInput){
    $('#errorMessages').empty();

    if(searchCategory.length == '' || searchInput.length == ''){
        var message = "Search category and Search input fields are mandatory.";
        $('#errorMessages').append($('<li>').attr({class: 'list-group-item list-group-item-danger'}).text(message));
        return false;
    }
    else return true;
}