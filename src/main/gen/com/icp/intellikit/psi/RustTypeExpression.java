// This is a generated file. Not intended for manual editing.
package com.icp.intellikit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustTypeExpression extends PsiElement {

  @Nullable
  RustArrayType getArrayType();

  @Nullable
  RustFunctionType getFunctionType();

  @Nullable
  RustPrimitiveType getPrimitiveType();

  @Nullable
  RustReferenceType getReferenceType();

  @Nullable
  RustStructType getStructType();

  @Nullable
  RustTupleType getTupleType();

}
