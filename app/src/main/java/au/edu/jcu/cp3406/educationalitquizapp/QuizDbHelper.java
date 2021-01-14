package au.edu.jcu.cp3406.educationalitquizapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import au.edu.jcu.cp3406.educationalitquizapp.QuizContract.*;



public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 2;

    private SQLiteDatabase db;

    public QuizDbHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionTable.COLUMN_DIFFICULTY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        // 10 Python Questions (Easy)
        Question q1 = new Question("What is the maximum possible length of an identifier?",
                "16", "32", "64", "None of these above", 4, Question.DIFFICULTY_EASY);
        addQuestion(q1);
        Question q2 = new Question("Who developed the Python language?",
                "Zim Den", "Guido van Rossum", "Niene Stom", "Wick van Rossum", 2, Question.DIFFICULTY_EASY);
        addQuestion(q2);
        Question q3 = new Question("In which year was the Python language developed?",
                "1995", "1972", "1981", "1989", 4, Question.DIFFICULTY_EASY);
        addQuestion(q3);
        Question q4 = new Question("What is the method inside the class in python language?",
                "Object", "Function", "Attribute", "Argument", 2, Question.DIFFICULTY_EASY);
        addQuestion(q4);
        Question q5 = new Question("Why does the name of local variables start with an underscore discouraged?",
                "To identify the variable", "It confuses the interpreter", "It indicates a private variable of a class", "None of these", 3, Question.DIFFICULTY_EASY);
        addQuestion(q5);
        Question q6 = new Question("Which of the following declarations is incorrect in python language?",
                "xyzp = 5,000,000", "x y z p = 5000 6000 7000 8000", "x,y,z,p = 5000, 6000, 7000, 8000", "x_y_z_p = 5,000,000", 2, Question.DIFFICULTY_EASY);
        addQuestion(q6);
        Question q7 = new Question("Study the following function: any([5>8, 6>3, 3>1]). What will be the output of this code? ",
                "False", "True", "Invalid code", "None of these", 2, Question.DIFFICULTY_EASY);
        addQuestion(q7);
        Question q8 = new Question("Which of the following is not a keyword in Python language?",
                "val", "raise", "try", "with", 1, Question.DIFFICULTY_EASY);
        addQuestion(q8);
        Question q9 = new Question("Which of the following operators is the correct option for power(ab)",
                "a ^ b", "a**b", "a ^ ^ b", "a ^ * b", 2, Question.DIFFICULTY_EASY);
        addQuestion(q9);
        Question q10 = new Question("What happens when '2' == 2 is executed?",
                "False", "True", "ValueError occurs", "TypeError occurs", 1, Question.DIFFICULTY_EASY);
        addQuestion(q10);




        // 10 JavaScript Questions (Medium)
        Question q11 = new Question("The pop() method of the array does which of the following task?",
                "decrements the total length by 1", "increments the total length by 1", "prints the first element but no effect on the length", "None of the above", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q11);
        Question q12 = new Question("What is the fundamental rule of lexical scoping?",
                "Functions are declared in the scope", "Functions are executed using scope chain", "Both a and b", "None of the mentioned", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q12);
        Question q13 = new Question("What will happen if a return statement does not have an associated expression?",
                "It returns the value 0", "It will throw an exception", "It returns the undefined value", "None of the mentioned", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q13);
        Question q14 = new Question("JavaScript Code can be called by using",
                "RMI", "Triggering Event", "Preprocessor", "Function/Method", 4, Question.DIFFICULTY_MEDIUM);
        addQuestion(q14);
        Question q15 = new Question("One of the special feature of an interpreter in reference with the for loop is that",
                "Before each iteration, the interpreter evaluates the variable expression and assigns the name of the property", "The iterations can be infinite when an interpreter is used", "The body of the loop is executed only once", "All of the mentioned", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q15);
        Question q16 = new Question("Which are usually variables that are used internally in object methods and also are globally visible variables?",
                "Object properties", "Variable properties", "Method properties", "Internal properties", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q16);
        Question q17 = new Question("Which of the following browsers use Webkit?",
                "Chrome", "Internet Explorer", "Safari", "Both a and c", 4, Question.DIFFICULTY_MEDIUM);
        addQuestion(q17);
        Question q18 = new Question("What is the purpose of the JavaScript Engine?",
                "Compiling the JavaScript", "Interpreting the JavaScript", "Both a and b", "None of the mentioned", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q18);
        Question q19 = new Question("What is the return type of the remote server?",
                "HTTP Response", "HTTP Request", "Get Request", "None of the mentioned", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q19);
        Question q20 = new Question("What is the returning value of the getContext() method?",
                " Drawing model", "CanvasRenderingContext2D object", "Context2D object", "None of the mentioned", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q20);



        //10 Java Questions (Hard)
        Question q21 = new Question("Which of the following option leads to the portability and security of Java?",
                "Bytecode is executed by JVM", "The applet makes the Java code secure and portable", "Use of exception handling", "Dynamic binding between objects", 1, Question.DIFFICULTY_HARD);
        addQuestion(q21);
        Question q22 = new Question("Which of the following is not a Java features?",
                "Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented", 3, Question.DIFFICULTY_HARD);
        addQuestion(q22);
        Question q23 = new Question("_____ is used to find and fix bugs in the Java programs.",
                "JVM", "JRE", "JDK", "JDB", 4, Question.DIFFICULTY_HARD);
        addQuestion(q23);
        Question q24 = new Question("What is the return type of the hashCode() method in the Object class?",
                "Object", "int", "long", "void", 2, Question.DIFFICULTY_HARD);
        addQuestion(q24);
        Question q25 = new Question("Which of the following is a valid long literal?",
                "ABH8097", "L990023", "904423", "0xnf029L", 4, Question.DIFFICULTY_HARD);
        addQuestion(q25);
        Question q26 = new Question("What does the expression float a = 35 / 0 return?",
                "0", "Not a Number", "Infinity", "Run time exception", 3, Question.DIFFICULTY_HARD);
        addQuestion(q26);
        Question q27 = new Question("Which of the following creates a List of 3 visible items and multiple selections abled?",
                "new List(false, 3)", "new List(3, true)", "new List(true, 3)", "new List(3, false)", 2, Question.DIFFICULTY_HARD);
        addQuestion(q27);
        Question q28 = new Question("Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?",
                "javap tool", "javaw command", "Javadoc tool", "javah command", 3, Question.DIFFICULTY_HARD);
        addQuestion(q28);
        Question q29 = new Question("Which of the following for loop declaration is not valid?",
                "for ( int i = 99; i >= 0; i / 9 )", "for ( int i = 7; i <= 77; i += 7 )", "for ( int i = 20; i >= 2; - -i )", "for ( int i = 2; i <= 20; i = 2* i )", 1, Question.DIFFICULTY_HARD);
        addQuestion(q29);
        Question q30 = new Question("In which process, a local variable has the same name as one of the instance variables?",
                "Serialization", "Variable Shadowing", "Abstraction", "Multi-threading", 2, Question.DIFFICULTY_HARD);
        addQuestion(q30);




    }
    private void addQuestion(Question question){
        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuestionTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionTable.COLUMN_DIFFICULTY, question.getDifficulty());
        db.insert(QuestionTable.TABLE_NAME, null, cv);

    }
    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM "+ QuestionTable.TABLE_NAME, null);
        if (c.moveToFirst()){
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionTable.COLUMN_DIFFICULTY)));

                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<Question> getQuestions(String difficulty) {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        String[] selectionArgs = new String[]{difficulty};
        Cursor c = db.rawQuery("SELECT * FROM "+ QuestionTable.TABLE_NAME +
                " WHERE " + QuestionTable.COLUMN_DIFFICULTY + " = ?" , selectionArgs);
        if (c.moveToFirst()){
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionTable.COLUMN_DIFFICULTY)));

                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }

}
