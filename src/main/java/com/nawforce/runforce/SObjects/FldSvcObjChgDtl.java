/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FldSvcObjChgDtl extends SObject {
	public static SObjectType$<FldSvcObjChgDtl> SObjectType;
	public static SObjectFields$<FldSvcObjChgDtl> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String FieldChangedName;
	public String FieldChangedValue;
	public Id FldSvcObjChgId;
	public FldSvcObjChg FldSvcObjChg;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public FldSvcObjChgDtl clone$() {throw new java.lang.UnsupportedOperationException();}
	public FldSvcObjChgDtl clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FldSvcObjChgDtl clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FldSvcObjChgDtl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FldSvcObjChgDtl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
