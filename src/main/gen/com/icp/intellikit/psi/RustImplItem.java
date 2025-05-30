// This is a generated file. Not intended for manual editing.
package com.icp.intellikit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustImplItem extends PsiElement {

  @NotNull
  RustFunctionBody getFunctionBody();

  @Nullable
  RustParameterList getParameterList();

  @Nullable
  RustTypeExpression getTypeExpression();

  @NotNull
  PsiElement getId();

}
