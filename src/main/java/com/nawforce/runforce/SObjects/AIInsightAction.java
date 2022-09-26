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
public class AIInsightAction extends SObject {
	public static SObjectType$<AIInsightAction> SObjectType;
	public static SObjectFields$<AIInsightAction> Fields;

	public Id ActionId;
	public Name Action;
	public String ActionName;
	public Id AiRecordInsightId;
	public AIRecordInsight AiRecordInsight;
	public Decimal Confidence;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime SystemModstamp;
	public String Type;

	public AIInsightValue[] AiInsightActions;
	public AIInsightFeedback[] Feedback;

	public AIInsightAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIInsightAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
