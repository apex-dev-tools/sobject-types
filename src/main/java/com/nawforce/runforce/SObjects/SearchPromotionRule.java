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
public class SearchPromotionRule extends SObject {
	public static SObjectType$<SearchPromotionRule> SObjectType;
	public static SObjectFields$<SearchPromotionRule> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id PromotedEntityId;
	public Knowledge__kav PromotedEntity;
	public String Query;
	public Datetime SystemModstamp;

	public SearchPromotionRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public SearchPromotionRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SearchPromotionRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SearchPromotionRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SearchPromotionRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
