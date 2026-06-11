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
public class KnowledgeArticleViewStat extends SObject {
	public static SObjectType$<KnowledgeArticleViewStat> SObjectType;
	public static SObjectFields$<KnowledgeArticleViewStat> Fields;

	public String Channel;
	public Id Id;
	public Boolean IsDeleted;
	public Decimal NormalizedScore;
	public Id ParentId;
	public KnowledgeArticle Parent;
	public Integer ViewCount;

	public KnowledgeArticleViewStat clone$() {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleViewStat clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleViewStat clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleViewStat clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleViewStat clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
