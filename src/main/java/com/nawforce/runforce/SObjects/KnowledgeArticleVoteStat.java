/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class KnowledgeArticleVoteStat extends SObject {
	public static SObjectType$<KnowledgeArticleVoteStat> SObjectType;
	public static SObjectFields$<KnowledgeArticleVoteStat> Fields;

	public String Channel;
	public Id Id;
	public Boolean IsDeleted;
	public Decimal NormalizedScore;
	public Id ParentId;
	public KnowledgeArticle Parent;

	public KnowledgeArticleVoteStat clone$() {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVoteStat clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVoteStat clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVoteStat clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVoteStat clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
