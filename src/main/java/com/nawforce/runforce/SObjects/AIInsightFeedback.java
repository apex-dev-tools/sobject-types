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
public class AIInsightFeedback extends SObject {
	public static SObjectType$<AIInsightFeedback> SObjectType;
	public static SObjectFields$<AIInsightFeedback> Fields;

	public String ActualValue;
	public String AiFeedback;
	public String AiInsightFeedbackType;
	public Id AiRecordInsightId;
	public AIRecordInsight AiRecordInsight;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer Rank;
	public Datetime SystemModstamp;
	public Id ValueId;
	public Name Value;

	public AIInsightFeedback clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIInsightFeedback clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightFeedback clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightFeedback clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightFeedback clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
