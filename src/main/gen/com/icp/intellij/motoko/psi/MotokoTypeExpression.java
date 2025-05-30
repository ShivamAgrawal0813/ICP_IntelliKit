// This is a generated file. Not intended for manual editing.
package com.icp.intellij.motoko.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MotokoTypeExpression extends PsiElement {

  @Nullable
  MotokoArrayType getArrayType();

  @Nullable
  MotokoFunctionType getFunctionType();

  @Nullable
  MotokoObjectType getObjectType();

  @Nullable
  MotokoPrimitiveType getPrimitiveType();

  @Nullable
  MotokoTypeReference getTypeReference();

}
