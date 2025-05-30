// This is a generated file. Not intended for manual editing.
package com.icp.intellij.motoko.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MotokoFunctionDeclaration extends PsiElement {

  @NotNull
  MotokoFunctionBody getFunctionBody();

  @Nullable
  MotokoParameterList getParameterList();

  @NotNull
  MotokoTypeExpression getTypeExpression();

  @NotNull
  PsiElement getId();

}
