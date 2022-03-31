package com.sg.testing.dao.implementations.buggy;

import com.sg.testing.dao.MonsterDao;
import com.sg.testing.model.Monster;
import com.sg.testing.model.MonsterType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BadMonsterDaoETest {
    private MonsterDao dao;

    public BadMonsterDaoETest(){
        dao = new BadMonsterDaoE();
    }

    @Test
    void addMonster() {
        Monster testMonster = new Monster(
                "Test Monster",
                MonsterType.WEREWOLF,
                100,
                "Nuggets"
        );
        dao.addMonster(1, testMonster);

        Monster foundMonster = dao.getMonster(1);

        assertEquals(testMonster.getName(), foundMonster.getName(),"Monster should be Test Monster");
    }

    @Test
    void getMonster() {
        Monster testMonster = new Monster(
                "Test Monster",
                MonsterType.WEREWOLF,
                100,
                "Nuggets"
        );
        dao.addMonster(1, testMonster);
        Monster retrieved = dao.getMonster(1);

        assertEquals(testMonster.getName(), retrieved.getName(), "Monster should be test Monster");
    }

    @Test
    void getAllMonsters() {
        Monster testMonster = new Monster(
                "Test Monster",
                MonsterType.WEREWOLF,
                100,
                "Nuggets"
        );
        dao.addMonster(1, testMonster);
        List<Monster> monsterList = dao.getAllMonsters();

        assertEquals(1, monsterList.size(), "There should be only 1 monster");
    }

    @Test
    void updateMonster() {
        Monster testMonster = new Monster(
                "Test Monster",
                MonsterType.WEREWOLF,
                100,
                "Nuggets"
        );
        dao.addMonster(1, testMonster);
        Monster editMonster = new Monster(
                "Updated Monster",
                MonsterType.SWAMPTHING,
                100,
                "Nuggets"
        );
        dao.updateMonster(1, editMonster);
        Monster retrievedMonster = dao.getMonster(1);

        assertEquals(editMonster.getType(),retrievedMonster.getType(),"Type should be Swampthing");
    }

    @Test
    void removeMonster() {
        Monster testMonster = new Monster(
                "Test Monster",
                MonsterType.WEREWOLF,
                100,
                "Nuggets"
        );
        dao.addMonster(1, testMonster);

        dao.removeMonster(1);

        Monster retrievedMonster = dao.getMonster(1);

        assertNull(retrievedMonster, "Should be null.");
    }

}