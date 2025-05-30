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

public class RustLiteralImpl extends ASTWrapperPsiElement implements RustLiteral {

  public RustLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RustVisitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) accept((RustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustBoolLiteral getBoolLiteral() {
    return findChildByClass(RustBoolLiteral.class);
  }

  @Override
  @Nullable
  public RustNumberLiteral getNumberLiteral() {
    return findChildByClass(RustNumberLiteral.class);
  }

  @Override
  @Nullable
  public RustStringLiteral getStringLiteral() {
    return findChildByClass(RustStringLiteral.class);
  }

}
