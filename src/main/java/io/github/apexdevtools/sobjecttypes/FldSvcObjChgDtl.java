/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
