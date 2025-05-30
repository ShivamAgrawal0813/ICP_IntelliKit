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
  public RustBlockExpression getBlockExpression() {
    return findChildByClass(RustBlockExpression.class);
  }

  @Override
  @Nullable
  public RustFunctionCall getFunctionCall() {
    return findChildByClass(RustFunctionCall.class);
  }

  @Override
  @Nullable
  public RustIdentifier getIdentifier() {
    return findChildByClass(RustIdentifier.class);
  }

  @Override
  @Nullable
  public RustLiteral getLiteral() {
    return findChildByClass(RustLiteral.class);
  }

}
