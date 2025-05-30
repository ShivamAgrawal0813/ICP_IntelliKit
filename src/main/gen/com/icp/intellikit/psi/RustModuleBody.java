// This is a generated file. Not intended for manual editing.
package com.icp.intellikit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustModuleBody extends PsiElement {

  @NotNull
  List<RustFunctionDeclaration> getFunctionDeclarationList();

  @NotNull
  List<RustImplDeclaration> getImplDeclarationList();

  @NotNull
  List<RustModuleDeclaration> getModuleDeclarationList();

  @NotNull
  List<RustStructDeclaration> getStructDeclarationList();

  @NotNull
  List<RustTraitDeclaration> getTraitDeclarationList();

  @NotNull
  List<RustTypeDeclaration> getTypeDeclarationList();

  @NotNull
  List<RustUseDeclaration> getUseDeclarationList();

}
