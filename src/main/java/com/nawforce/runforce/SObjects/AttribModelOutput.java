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
public class AttribModelOutput extends SObject {
	public static SObjectType$<AttribModelOutput> SObjectType;
	public static SObjectFields$<AttribModelOutput> Fields;

	public Id AttribModelId;
	public AttribModel AttribModel;
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
	public String OutputDataLakeObjectApiName;
	public Datetime SystemModstamp;

	public AttribModelOutputKeyField[] AttribModelOutputKeyFields;

	public AttribModelOutput clone$() {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutput clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutput clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutput clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutput clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
