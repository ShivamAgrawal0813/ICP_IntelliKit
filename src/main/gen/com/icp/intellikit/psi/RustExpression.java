// This is a generated file. Not intended for manual editing.
package com.icp.intellikit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustExpression extends PsiElement {

  @Nullable
  RustArrayExpression getArrayExpression();

  @Nullable
  RustBinaryExpression getBinaryExpression();

  @Nullable
  RustCallExpression getCallExpression();

  @Nullable
  RustFieldExpression getFieldExpression();

  @Nullable
  RustLiteral getLiteral();

  @Nullable
  RustMethodCallExpression getMethodCallExpression();

  @Nullable
  RustStructExpression getStructExpression();

  @Nullable
  RustTupleExpression getTupleExpression();

  @Nullable
  PsiElement getId();

}
