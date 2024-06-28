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
public class GnrcAsmtTaskContextRela extends SObject {
	public static SObjectType$<GnrcAsmtTaskContextRela> SObjectType;
	public static SObjectFields$<GnrcAsmtTaskContextRela> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id GenericAssessmentTaskId;
	public GenericAssessmentTask GenericAssessmentTask;
	public Id GnrcAssessmentTaskContextId;
	public GenericAsmtTaskContext GnrcAssessmentTaskContext;
	public Id Id;
	public String ImplementorType;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime SystemModstamp;
	public Integer VisitTaskContextSequence;

	public GnrcAsmtTaskContextRela clone$() {throw new java.lang.UnsupportedOperationException();}
	public GnrcAsmtTaskContextRela clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GnrcAsmtTaskContextRela clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GnrcAsmtTaskContextRela clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GnrcAsmtTaskContextRela clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
