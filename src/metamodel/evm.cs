SYNTAXDEF evm
FOR <http://funthomas424242.github.com/rades/evm>
START EyeViewModel

OPTIONS{
 reloadGeneratorModel="true";
 generateCodeFromGeneratorModel="true"; //wichtig um Fehler im Generat zu vermeiden
 disableLaunchSupport="false";
 usePredefinedTokens="true";
 //srcFolder = "src/main/java";
 //srcGenFolder = "target/generated-sources/java";
 //uiSrcFolder = "src/main/java";
 //uiSrcGenFolder = "target/generated-sources/java";
}


TOKENSTYLES {
    "EyeViewModel" COLOR #7F0055, BOLD;
    "class", "method" COLOR #404040, BOLD;
    "Label", "Button", "InputField" COLOR #7F0055, BOLD;
}

RULES {
    //ImportERModel ::= "import" erm:erm.Entity ";";
    //Import ::= ("import" importedResource['<','>'] "." )+ ;
    //EyeViewModel ::= "EyeViewModel" ("imports:" imports)? "{" (views)+ "}";
    EyeViewModel ::= "EyeViewModel" //("imports:" imports)?
     "{" (elements)+ "}";
   
   // Beschreibung der Formulare
    Formular ::= "Formular" name['"','"'] "{"  ("layout" "{" layouts "}" ) (labels | buttons | inputs)* "}";
    
    InputField ::= "InputField" name['"','"'] "{" ("validationService" validationService)? "}" ;
    Label ::= "Label"   name['"','"'] "{" ("text" "=" text['"','"'])? ("img" "=" img['"','"'])? ("button:" button['"','"'])? "}";
    Button ::= "Button"   name['"','"'] "{" ("text" "=" text['"','"'])? ("img" "=" img['"','"'])?  
    ("validationService" validationService)? "actionService" actionService
    "}";
    VerticalLayout ::= "vertical" "{" (sublayout)* (content['[',']'] )* "}" ;
    HorizontalLayout ::= "horizontal" "{" (sublayout)* (content['[',']'] )* "}" ;
    
    // Beschreibung von PopUps
    PopUp ::= "PopUp" name['"','"'] "{" ("layout" "{" layouts "}" ) "}" ;
    
    // Beschreibung von Reports
    Report ::= "Report" name['"','"'] "{" ("layout" "{" layouts "}" ) "}" ;
    
    //Beschreibung der Navigationswege
    Navigationpath ::= "Navigation" name['"','"'] "{"   "}";
    
    //Servicedefinitionen
    Service ::= "{" "class" className['"','"'] "method" methodName['"','"']   "}" ;
    
}