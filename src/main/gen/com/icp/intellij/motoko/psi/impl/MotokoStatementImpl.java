// This is a generated file. Not intended for manual editing.
package com.icp.intellij.motoko.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.icp.intellij.motoko.psi.MotokoTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.icp.intellij.motoko.psi.*;

public class MotokoStatementImpl extends ASTWrapperPsiElement implements MotokoStatement {

  public MotokoStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MotokoVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MotokoVisitor) accept((MotokoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MotokoExpressionStatement getExpressionStatement() {
    return findChildByClass(MotokoExpressionStatement.class);
  }

  @Override
  @Nullable
  public MotokoIfStatement getIfStatement() {
    return findChildByClass(MotokoIfStatement.class);
  }

  @Override
  @Nullable
  public MotokoLoopStatement getLoopStatement() {
    return findChildByClass(MotokoLoopStatement.class);
  }

  @Override
  @Nullable
  public MotokoReturnStatement getReturnStatement() {
    return findChildByClass(MotokoReturnStatement.class);
  }

}
