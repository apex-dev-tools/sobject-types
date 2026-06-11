/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
