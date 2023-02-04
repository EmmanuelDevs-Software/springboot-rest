package restcrudjpa.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import restcrudjpa.rest.model.Tutorial;

class TutorialControllerTest {
    /**
     * Method under test: {@link TutorialController#getAllTutorials(String)}
     */
    @Test
    void testGetAllTutorials() {
        ResponseEntity<List<Tutorial>> actualAllTutorials = (new TutorialController()).getAllTutorials("Dr");
        assertNull(actualAllTutorials.getBody());
        assertEquals(500, actualAllTutorials.getStatusCodeValue());
        assertTrue(actualAllTutorials.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link TutorialController#getAllTutorials(String)}
     */
    @Test
    void testGetAllTutorials2() {
        ResponseEntity<List<Tutorial>> actualAllTutorials = (new TutorialController()).getAllTutorials(null);
        assertNull(actualAllTutorials.getBody());
        assertEquals(500, actualAllTutorials.getStatusCodeValue());
        assertTrue(actualAllTutorials.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link TutorialController#getTutorialById(long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTutorialById() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new TutorialController()).getTutorialById(123L);
    }

    /**
     * Method under test: {@link TutorialController#createTutorial(Tutorial)}
     */
    @Test
    void testCreateTutorial() {
        TutorialController tutorialController = new TutorialController();
        ResponseEntity<Tutorial> actualCreateTutorialResult = tutorialController
                .createTutorial(new Tutorial("Dr", "The characteristics of someone or something", true));
        assertNull(actualCreateTutorialResult.getBody());
        assertEquals(500, actualCreateTutorialResult.getStatusCodeValue());
        assertTrue(actualCreateTutorialResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link TutorialController#createTutorial(Tutorial)}
     */
    @Test
    void testCreateTutorial2() {
        ResponseEntity<Tutorial> actualCreateTutorialResult = (new TutorialController()).createTutorial(null);
        assertNull(actualCreateTutorialResult.getBody());
        assertEquals(500, actualCreateTutorialResult.getStatusCodeValue());
        assertTrue(actualCreateTutorialResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link TutorialController#createTutorial(Tutorial)}
     */
    @Test
    void testCreateTutorial3() {
        TutorialController tutorialController = new TutorialController();
        Tutorial tutorial = mock(Tutorial.class);
        when(tutorial.getDescription()).thenReturn("The characteristics of someone or something");
        when(tutorial.getTitle()).thenReturn("Dr");
        ResponseEntity<Tutorial> actualCreateTutorialResult = tutorialController.createTutorial(tutorial);
        assertNull(actualCreateTutorialResult.getBody());
        assertEquals(500, actualCreateTutorialResult.getStatusCodeValue());
        assertTrue(actualCreateTutorialResult.getHeaders().isEmpty());
        verify(tutorial).getDescription();
        verify(tutorial).getTitle();
    }

    /**
     * Method under test: {@link TutorialController#updateTutorial(long, Tutorial)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateTutorial() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        TutorialController tutorialController = new TutorialController();
        tutorialController.updateTutorial(123L, new Tutorial("Dr", "The characteristics of someone or something", true));
    }

    /**
     * Method under test: {@link TutorialController#updateTutorial(long, Tutorial)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateTutorial2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new TutorialController()).updateTutorial(123L, mock(Tutorial.class));
    }

    /**
     * Method under test: {@link TutorialController#deleteTutorial(long)}
     */
    @Test
    void testDeleteTutorial() {
        ResponseEntity<HttpStatus> actualDeleteTutorialResult = (new TutorialController()).deleteTutorial(123L);
        assertNull(actualDeleteTutorialResult.getBody());
        assertEquals(500, actualDeleteTutorialResult.getStatusCodeValue());
        assertTrue(actualDeleteTutorialResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link TutorialController#deleteAllTutorials()}
     */
    @Test
    void testDeleteAllTutorials() {
        ResponseEntity<HttpStatus> actualDeleteAllTutorialsResult = (new TutorialController()).deleteAllTutorials();
        assertNull(actualDeleteAllTutorialsResult.getBody());
        assertEquals(500, actualDeleteAllTutorialsResult.getStatusCodeValue());
        assertTrue(actualDeleteAllTutorialsResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link TutorialController#findByPublished()}
     */
    @Test
    void testFindByPublished() {
        ResponseEntity<List<Tutorial>> actualFindByPublishedResult = (new TutorialController()).findByPublished();
        assertNull(actualFindByPublishedResult.getBody());
        assertEquals(500, actualFindByPublishedResult.getStatusCodeValue());
        assertTrue(actualFindByPublishedResult.getHeaders().isEmpty());
    }
}

