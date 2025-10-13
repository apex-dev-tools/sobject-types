/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PersnlBatchDcsnPersnlPoint extends SObject {
	public static SObjectType$<PersnlBatchDcsnPersnlPoint> SObjectType;
	public static SObjectFields$<PersnlBatchDcsnPersnlPoint> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id PersnlBatchDecisionId;
	public PersnlBatchDecision PersnlBatchDecision;
	public Id PersonalizationPointId;
	public PersonalizationPoint PersonalizationPoint;
	public Datetime SystemModstamp;

	public PersnlBatchDcsnPersnlPoint clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnPersnlPoint clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnPersnlPoint clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnPersnlPoint clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnPersnlPoint clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
