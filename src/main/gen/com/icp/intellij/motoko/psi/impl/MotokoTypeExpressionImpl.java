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

public class MotokoTypeExpressionImpl extends ASTWrapperPsiElement implements MotokoTypeExpression {

  public MotokoTypeExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MotokoVisitor visitor) {
    visitor.visitTypeExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MotokoVisitor) accept((MotokoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MotokoArrayType getArrayType() {
    return findChildByClass(MotokoArrayType.class);
  }

  @Override
  @Nullable
  public MotokoFunctionType getFunctionType() {
    return findChildByClass(MotokoFunctionType.class);
  }

  @Override
  @Nullable
  public MotokoObjectType getObjectType() {
    return findChildByClass(MotokoObjectType.class);
  }

  @Override
  @Nullable
  public MotokoPrimitiveType getPrimitiveType() {
    return findChildByClass(MotokoPrimitiveType.class);
  }

  @Override
  @Nullable
  public MotokoTypeReference getTypeReference() {
    return findChildByClass(MotokoTypeReference.class);
  }

}
