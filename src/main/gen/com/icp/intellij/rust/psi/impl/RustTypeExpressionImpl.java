// This is a generated file. Not intended for manual editing.
package com.icp.intellij.rust.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.icp.intellij.rust.psi.RustTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.icp.intellij.rust.psi.*;

public class RustTypeExpressionImpl extends ASTWrapperPsiElement implements RustTypeExpression {

  public RustTypeExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RustVisitor visitor) {
    visitor.visitTypeExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) accept((RustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustArrayType getArrayType() {
    return findChildByClass(RustArrayType.class);
  }

  @Override
  @Nullable
  public RustFunctionType getFunctionType() {
    return findChildByClass(RustFunctionType.class);
  }

  @Override
  @Nullable
  public RustPrimitiveType getPrimitiveType() {
    return findChildByClass(RustPrimitiveType.class);
  }

  @Override
  @Nullable
  public RustStructType getStructType() {
    return findChildByClass(RustStructType.class);
  }

}
