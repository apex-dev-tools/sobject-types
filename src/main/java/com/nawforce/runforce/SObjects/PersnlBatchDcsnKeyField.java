/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PersnlBatchDcsnKeyField extends SObject {
	public static SObjectType$<PersnlBatchDcsnKeyField> SObjectType;
	public static SObjectFields$<PersnlBatchDcsnKeyField> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FieldType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id PersnlBatchDecisionId;
	public PersnlBatchDecision PersnlBatchDecision;
	public Integer Sequence;
	public Datetime SystemModstamp;

	public PersnlBatchDcsnKeyField clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnKeyField clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnKeyField clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnKeyField clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnKeyField clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
