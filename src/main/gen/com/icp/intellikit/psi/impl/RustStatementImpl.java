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

public class RustStatementImpl extends ASTWrapperPsiElement implements RustStatement {

  public RustStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RustVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) accept((RustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustExpressionStatement getExpressionStatement() {
    return findChildByClass(RustExpressionStatement.class);
  }

  @Override
  @Nullable
  public RustForStatement getForStatement() {
    return findChildByClass(RustForStatement.class);
  }

  @Override
  @Nullable
  public RustIfStatement getIfStatement() {
    return findChildByClass(RustIfStatement.class);
  }

  @Override
  @Nullable
  public RustLetStatement getLetStatement() {
    return findChildByClass(RustLetStatement.class);
  }

  @Override
  @Nullable
  public RustLoopStatement getLoopStatement() {
    return findChildByClass(RustLoopStatement.class);
  }

  @Override
  @Nullable
  public RustMatchStatement getMatchStatement() {
    return findChildByClass(RustMatchStatement.class);
  }

  @Override
  @Nullable
  public RustReturnStatement getReturnStatement() {
    return findChildByClass(RustReturnStatement.class);
  }

  @Override
  @Nullable
  public RustWhileStatement getWhileStatement() {
    return findChildByClass(RustWhileStatement.class);
  }

}
