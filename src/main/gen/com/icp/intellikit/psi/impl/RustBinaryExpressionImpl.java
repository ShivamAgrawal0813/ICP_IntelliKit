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

public class RustBinaryExpressionImpl extends ASTWrapperPsiElement implements RustBinaryExpression {

  public RustBinaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RustVisitor visitor) {
    visitor.visitBinaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) accept((RustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustExpression.class);
  }

  @Override
  @NotNull
  public RustOperator getOperator() {
    return findNotNullChildByClass(RustOperator.class);
  }

}
