/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CaseArticle extends SObject {
	public static SObjectType$<CaseArticle> SObjectType;
	public static SObjectFields$<CaseArticle> Fields;

	public String ArticleLanguage;
	public Integer ArticleVersionNumber;
	public Id CaseId;
	public Case Case;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSharedByEmail;
	public Id KnowledgeArticleId;
	public Knowledge__ka KnowledgeArticle;
	public Id KnowledgeArticleVersionId;
	public Knowledge__kav KnowledgeArticleVersion;
	public Datetime SystemModstamp;

	public CaseArticle clone$() {throw new java.lang.UnsupportedOperationException();}
	public CaseArticle clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CaseArticle clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CaseArticle clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CaseArticle clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
