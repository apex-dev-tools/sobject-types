/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AIInsightValue extends SObject {
	public static SObjectFields$<AIInsightValue> Fields;

	public Id AiInsightActionId;
	public AIInsightAction AiInsightAction;
	public Id AiRecordInsightId;
	public AIRecordInsight AiRecordInsight;
	public Decimal Confidence;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String Field;
	public com.nawforce.runforce.System.String FieldValueLowerBound;
	public com.nawforce.runforce.System.String FieldValueUpperBound;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Name;
	public Id SobjectLookupValueId;
	public SObject SobjectLookupValue;
	public com.nawforce.runforce.System.String SobjectType;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Value;
	public com.nawforce.runforce.System.String ValueType;

	public AIInsightReason[] AIInsightReasons;
	public AIInsightFeedback[] Feedback;

	public AIInsightValue clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIInsightValue clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightValue clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightValue clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightValue clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
