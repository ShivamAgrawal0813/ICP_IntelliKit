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

public class MotokoNumberLiteralImpl extends ASTWrapperPsiElement implements MotokoNumberLiteral {

  public MotokoNumberLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MotokoVisitor visitor) {
    visitor.visitNumberLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MotokoVisitor) accept((MotokoVisitor)visitor);
    else super.accept(visitor);
  }

}
