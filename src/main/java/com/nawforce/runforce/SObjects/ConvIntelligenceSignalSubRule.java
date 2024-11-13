/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ConvIntelligenceSignalSubRule extends SObject {
	public static SObjectType$<ConvIntelligenceSignalSubRule> SObjectType;
	public static SObjectFields$<ConvIntelligenceSignalSubRule> Fields;

	public Id ConvIntelligenceSignalRuleId;
	public ConvIntelligenceSignalRule ConvIntelligenceSignalRule;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String OperandValue;
	public String Operator;
	public Integer Order;
	public Datetime SystemModstamp;
	public String Type;

	public ConvIntelligenceSignalSubRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConvIntelligenceSignalSubRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConvIntelligenceSignalSubRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConvIntelligenceSignalSubRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConvIntelligenceSignalSubRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
