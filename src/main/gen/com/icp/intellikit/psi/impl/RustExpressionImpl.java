// This is a generated file. Not intended for manual editing.
package com.icp.intellikit.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.icp.intellikit.psi.RustTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.icp.intellikit.psi.*;

public class RustExpressionImpl extends ASTWrapperPsiElement implements RustExpression {

  public RustExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RustVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) accept((RustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustArrayExpression getArrayExpression() {
    return findChildByClass(RustArrayExpression.class);
  }

  @Override
  @Nullable
  public RustBinaryExpression getBinaryExpression() {
    return findChildByClass(RustBinaryExpression.class);
  }

  @Override
  @Nullable
  public RustCallExpression getCallExpression() {
    return findChildByClass(RustCallExpression.class);
  }

  @Override
  @Nullable
  public RustFieldExpression getFieldExpression() {
    return findChildByClass(RustFieldExpression.class);
  }

  @Override
  @Nullable
  public RustLiteral getLiteral() {
    return findChildByClass(RustLiteral.class);
  }

  @Override
  @Nullable
  public RustMethodCallExpression getMethodCallExpression() {
    return findChildByClass(RustMethodCallExpression.class);
  }

  @Override
  @Nullable
  public RustStructExpression getStructExpression() {
    return findChildByClass(RustStructExpression.class);
  }

  @Override
  @Nullable
  public RustTupleExpression getTupleExpression() {
    return findChildByClass(RustTupleExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}
