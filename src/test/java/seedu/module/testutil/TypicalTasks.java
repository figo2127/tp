package seedu.module.testutil;

import static seedu.module.logic.commands.CommandTestUtil.VALID_DEADLINE_LAB;
import static seedu.module.logic.commands.CommandTestUtil.VALID_DEADLINE_PRACTICAL;
import static seedu.module.logic.commands.CommandTestUtil.VALID_DESCRIPTION_LAB;
import static seedu.module.logic.commands.CommandTestUtil.VALID_DESCRIPTION_PRACTICAL;
import static seedu.module.logic.commands.CommandTestUtil.VALID_MODULE_LAB;
import static seedu.module.logic.commands.CommandTestUtil.VALID_MODULE_PRACTICAL;
import static seedu.module.logic.commands.CommandTestUtil.VALID_START_TIME_PRACTICAL;
import static seedu.module.logic.commands.CommandTestUtil.VALID_TAG_PRIORITY_HIGH;
import static seedu.module.logic.commands.CommandTestUtil.VALID_TAG_PRIORITY_LOW;
import static seedu.module.logic.commands.CommandTestUtil.VALID_TASK_NAME_LAB;
import static seedu.module.logic.commands.CommandTestUtil.VALID_TASK_NAME_PRACTICAL;
import static seedu.module.logic.commands.CommandTestUtil.VALID_WORKLOAD_1;
import static seedu.module.logic.commands.CommandTestUtil.VALID_WORKLOAD_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.module.model.ModuleBook;
import seedu.module.model.task.Task;

/**
 * A utility class containing a list of {@code Task} objects to be used in tests.
 */
public class TypicalTasks {
    public static final String DONE_STRING = String.valueOf(Boolean.TRUE);
    public static final String NOT_DONE_STRING = String.valueOf(Boolean.FALSE);

    public static final Task QUIZ = new TaskBuilder().activateStartTime().withName("Quiz")
            .withDescription("About Artificial Intelligence.").withModule("CS3243")
            .withStartTime("2021-02-01 11:30").withDeadline("2021-02-01 12:00").withDoneStatus(NOT_DONE_STRING)
            .withWorkload("1").withTags("medianPriority").build();

    public static final Task MIDTERM = new TaskBuilder().withName("Midterm").withStartTime("2021-12-12 06:30")
            .withDescription("Not include CSP.").withWorkload("2")
            .withModule("CS3243").withDeadline("2021-12-12 08:30").withDoneStatus(NOT_DONE_STRING)
            .withRecurrence("biweekly").withTags("highPriority").build();

    public static final Task RECURRING_MIDTERM = new TaskBuilder().withName("Midterm").withStartTime("2021-12-12 06:30")
            .withDescription("Not include CSP.").withWorkload("2")
            .withModule("CS3243").withDeadline("2021-12-26 08:30").withDoneStatus(NOT_DONE_STRING)
            .withRecurrence("biweekly").withTags("highPriority").build();

    public static final Task TP = new TaskBuilder().withName("TP")
            .withDeadline("2021-03-14 14:00").withWorkload("3")
            .withModule("CS2103T").withDescription("Wrap up v1.2.").withDoneStatus(DONE_STRING).build();

    public static final Task TUTORIAL = new TaskBuilder().withName("Tutorial")
            .withDeadline("2021-03-02 23:59").withWorkload("2")
            .withModule("ST2131").withDoneStatus(NOT_DONE_STRING).withDescription("Try to get full mark.")
            .withTags("easy").build();

    public static final Task PROJECT = new TaskBuilder().withName("Project").withWorkload("3")
            .withDeadline("2021-02-28 23:59").withDoneStatus(NOT_DONE_STRING)
            .withModule("CS3243").withDescription("This is really challenging.").build();

    public static final Task PAQ = new TaskBuilder().withName("PAQ").withWorkload("1")
            .withDeadline("2021-03-05 23:59").withDoneStatus(DONE_STRING)
            .withModule("IS1103").withDescription("Strange questions.").build();

    public static final Task OP = new TaskBuilder().withName("OP 2").withWorkload("2")
            .withDeadline("2021-04-02 23:59").withDoneStatus(NOT_DONE_STRING)
            .withModule("CS2101").withDescription("Need to divide ourselves into two groups.").build();

    public static final Task REVIEW = new TaskBuilder().withName("Review").withModule("CS3244")
            .withWorkload("2").withDescription("ML FTW").withDeadline("2021-03-02 00:00")
            .withDoneStatus(DONE_STRING).build();

    // Manually added
    public static final Task MISSION = new TaskBuilder().withName("Mission")
            .withDeadline("2021-03-05 23:59").withDoneStatus(DONE_STRING).withWorkload("1")
            .withModule("IS1103").withDescription("Strange questions.").build();
    public static final Task FINAL = new TaskBuilder().withName("Final").withWorkload("3")
            .withDeadline("2021-04-29 23:59").withDoneStatus(NOT_DONE_STRING)
            .withModule("ST2131").withDescription("Let's go!").build();

    // Manually added - Task's details found in {@code CommandTestUtil}
    public static final Task LAB = new TaskBuilder()
            .withName(VALID_TASK_NAME_LAB)
            .withDeadline(VALID_DEADLINE_LAB)
            .withModule(VALID_MODULE_LAB)
            .withDescription(VALID_DESCRIPTION_LAB)
            .withWorkload(VALID_WORKLOAD_1)
            .withDoneStatus(NOT_DONE_STRING)
            .withTags(VALID_TAG_PRIORITY_LOW).build();

    public static final Task PRACTICAL = new TaskBuilder().activateStartTime()
            .withName(VALID_TASK_NAME_PRACTICAL)
            .withStartTime(VALID_START_TIME_PRACTICAL)
            .withDeadline(VALID_DEADLINE_PRACTICAL)
            .withModule(VALID_MODULE_PRACTICAL)
            .withDescription(VALID_DESCRIPTION_PRACTICAL)
            .withWorkload(VALID_WORKLOAD_2)
            .withDoneStatus(NOT_DONE_STRING)
            .withTags(VALID_TAG_PRIORITY_HIGH, VALID_TAG_PRIORITY_LOW)
            .build();

    private TypicalTasks() {} // prevents instantiation

    /**
     * Returns an {@code ModuleBook} with all the typical tasks.
     */
    public static ModuleBook getTypicalModuleBook() {
        ModuleBook mb = new ModuleBook();
        for (Task task : getTypicalTasks()) {
            mb.addTask(task);
        }
        return mb;
    }

    /**
     * Returns an {@code ModuleBook} with all the typical tasks sorted by deadline.
     */
    public static ModuleBook getSortedTypicalModuleBookByDeadline() {
        ModuleBook ab = new ModuleBook();
        ab.addTask(QUIZ); // 02-01
        ab.addTask(PROJECT); // 02-28
        ab.addTask(TUTORIAL); // 03-02
        ab.addTask(PAQ); // 03-05
        ab.addTask(TP); // 03-14
        ab.addTask(OP); // 04-02
        ab.addTask(MIDTERM); // 12-12
        return ab;
    }

    /**
     * Returns an {@code ModuleBook} with all the typical tasks sorted by workload.
     */
    public static ModuleBook getSortedTypicalModuleBookByWorkload() {
        ModuleBook ab = new ModuleBook();
        ab.addTask(TP); // 3
        ab.addTask(PROJECT); // 3
        ab.addTask(MIDTERM); // 2
        ab.addTask(TUTORIAL); // 2
        ab.addTask(OP); // 2
        ab.addTask(QUIZ); // 1
        ab.addTask(PAQ); // 1
        return ab;
    }

    /**
     * Returns an {@code ModuleBook} with all the typical tasks sorted by module.
     */
    public static ModuleBook getSortedTypicalModuleBookByModule() {
        ModuleBook ab = new ModuleBook();
        ab.addTask(TUTORIAL); // ST2131
        ab.addTask(PAQ); // IS1103
        ab.addTask(QUIZ); // CS3243
        ab.addTask(MIDTERM); // CS3243
        ab.addTask(PROJECT); // CS3243
        ab.addTask(TP); // CS2103T
        ab.addTask(OP); // CS2101
        return ab;
    }

    /**
     * Returns an {@code ModuleBook} with all the typical tasks sorted by task name.
     */
    public static ModuleBook getSortedTypicalModuleBookByName() {
        ModuleBook ab = new ModuleBook();
        ab.addTask(MIDTERM);
        ab.addTask(OP);
        ab.addTask(PAQ);
        ab.addTask(PROJECT);
        ab.addTask(QUIZ);
        ab.addTask(TP);
        ab.addTask(TUTORIAL);
        return ab;
    }

    /**
     * Returns an {@code ModuleBook} with all the typical tasks sorted by description.
     */
    public static ModuleBook getSortedTypicalModuleBookByDescription() {
        ModuleBook ab = new ModuleBook();
        ab.addTask(OP); // Need to divide ourselves into two groups.
        ab.addTask(QUIZ); // About Artificial Intelligence.
        ab.addTask(PROJECT); // This is really challenging.
        ab.addTask(TUTORIAL); // Try to get full mark.
        ab.addTask(PAQ); // Strange questions.
        ab.addTask(MIDTERM); // Not include CSP.
        ab.addTask(TP); // Wrap up v1.2.
        return ab;
    }

    /**
     * Returns an {@code ModuleBook} with all the typical tasks sorted by number of tags.
     */
    public static ModuleBook getSortedTypicalModuleBookByTag() {
        ModuleBook ab = new ModuleBook();
        ab.addTask(QUIZ); // 1
        ab.addTask(MIDTERM); // 1
        ab.addTask(TUTORIAL); // 1
        ab.addTask(TP); // 0
        ab.addTask(PROJECT); // 0
        ab.addTask(PAQ); // 0
        ab.addTask(OP); // 0
        return ab;
    }

    public static List<Task> getTypicalTasks() {
        return new ArrayList<>(Arrays.asList(QUIZ, MIDTERM, TP, TUTORIAL, PROJECT, PAQ, OP));
    }
}
