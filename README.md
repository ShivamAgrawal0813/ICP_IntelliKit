# ICP Language Support for JetBrains IDEs

This plugin provides first-class support for Internet Computer Protocol (ICP) languages in JetBrains IDEs.

## Features

- Full Motoko language support
  - Syntax highlighting
  - Code completion
  - Error detection
  - Navigation
- ICP-compatible Rust support
- DFX project integration
- Canister deployment utilities

## Project Structure

```
src/
├── main/
│   ├── kotlin/
│   │   └── com/
│   │       └── icp/
│   │           └── intellij/
│   │               ├── motoko/
│   │               │   ├── parser/
│   │               │   │   ├── MotokoLexer.kt
│   │               │   │   ├── MotokoParser.kt
│   │               │   │   └── MotokoParserDefinition.kt
│   │               │   ├── psi/
│   │               │   │   ├── MotokoFile.kt
│   │               │   └── MotokoTokenTypes.kt
│   │               │   ├── MotokoFileType.kt
│   │               │   ├── MotokoLanguage.kt
│   │               │   └── MotokoIcons.kt
│   │               └── project/
│   │                   └── DfxProjectStructureDetector.kt
│   └── resources/
│       ├── META-INF/
│       │   └── plugin.xml
│       └── icons/
│           ├── motoko.svg
│           ├── actor.svg
│           ├── module.svg
│           └── function.svg
```

## Current Progress

### ✅ Completed
- Basic plugin structure with Gradle + JetBrains Plugin SDK
- Motoko file type registration
- Basic syntax highlighting structure
- Token type definitions
- Basic DFX project detection structure

### 🚧 In Progress
- Grammar specifications for Motoko
- Lexer and Parser implementation
- PSI structure for Motoko constructs
- Complete syntax highlighting
- Project structure detection

### 📝 TODO
- Rust language support
- Complete DFX project recognition
- File/folder icon customization
- Module organization
- Canister deployment utilities

## Development Setup

1. Clone the repository
2. Open in IntelliJ IDEA
3. Install Grammar-Kit and JFlex Support plugins
4. Build with Gradle: `.\gradlew.bat buildPlugin`

## License

Apache License 2.0
