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

public class RustTraitItemImpl extends ASTWrapperPsiElement implements RustTraitItem {

  public RustTraitItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RustVisitor visitor) {
    visitor.visitTraitItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) accept((RustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustParameterList getParameterList() {
    return findChildByClass(RustParameterList.class);
  }

  @Override
  @Nullable
  public RustTypeExpression getTypeExpression() {
    return findChildByClass(RustTypeExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

}
