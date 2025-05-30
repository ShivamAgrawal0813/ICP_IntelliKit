// This is a generated file. Not intended for manual editing.
package com.icp.intellij.motoko.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MotokoModuleBody extends PsiElement {

  @NotNull
  List<MotokoFunctionDeclaration> getFunctionDeclarationList();

  @NotNull
  List<MotokoTypeDeclaration> getTypeDeclarationList();

  @NotNull
  List<MotokoVariableDeclaration> getVariableDeclarationList();

}
