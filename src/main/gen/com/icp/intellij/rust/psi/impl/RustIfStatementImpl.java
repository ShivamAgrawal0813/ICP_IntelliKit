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

public class RustIfStatementImpl extends ASTWrapperPsiElement implements RustIfStatement {

  public RustIfStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RustVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) accept((RustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustBlock> getBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustBlock.class);
  }

  @Override
  @NotNull
  public RustExpression getExpression() {
    return findNotNullChildByClass(RustExpression.class);
  }

  @Override
  @Nullable
  public RustIfStatement getIfStatement() {
    return findChildByClass(RustIfStatement.class);
  }

}
