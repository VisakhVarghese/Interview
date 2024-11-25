//package jdk_;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.StackPane;
//import javafx.scene.control.Button;
//import javafx.stage.Stage;
//
//import javax.script.ScriptEngine;
//import javax.script.ScriptEngineManager;
//import javax.script.ScriptException;
//
//public class NashornJSEngine extends Application {
//    public static void main(String[] args)  {
//        launch(args);
//        // Create a Nashorn script engine
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("nashorn");
//
//        String script = "var greeting = 'Hello, World!'; greeting;";
//        try {
//            // Evaluate the script
//            Object result = engine.eval(script);
//            System.out.println(result);  // Output: Hello, World!
//        } catch (ScriptException e) {
//            e.printStackTrace();
//        }
//
//        String scripts = "var ArrayList = Java.type('java.util.ArrayList');" +
//                "var list = new ArrayList();" +
//                "list.add('Hello');" +
//                "list.add('World');" +
//                "list.toString();";
//
//        try {
//            Object results = engine.eval(scripts);
//            System.out.println(results);  // Output: [Hello, World]
//        } catch (ScriptException e) {
//            e.printStackTrace();
//        }
//    }
//
////    Nashorn can be used to script JavaFX applications, enabling dynamic UI updates
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("nashorn");
//
//        Button btn = new Button();
//        btn.setText("Click me");
//
//        // JavaScript to handle button click
//        String script = "function handleButtonClick() { " +
//                "    print('Button was clicked!'); " +
//                "}";
//
//        try {
//            engine.eval(script);
//        } catch (ScriptException e) {
//            e.printStackTrace();
//        }
//
//        btn.setOnAction(event -> {
//            try {
//                engine.eval("handleButtonClick()");
//            } catch (ScriptException e) {
//                e.printStackTrace();
//            }
//        });
//
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//
//        Scene scene = new Scene(root, 300, 250);
//
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}
//
///**
// * Nashorn was a JavaScript engine introduced in Java 8
// * developers to run JavaScript code from within Java applications,
// * providing a means to embed and execute JavaScript on the Java Virtual Machine (JVM).
// */
