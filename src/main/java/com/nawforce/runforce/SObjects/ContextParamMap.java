/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContextParamMap extends SObject {
	public static SObjectType$<ContextParamMap> SObjectType;
	public static SObjectFields$<ContextParamMap> Fields;

	public Id ContextEntityId;
	public SObject ContextEntity;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MapKey;
	public String MapValue;
	public Datetime SystemModstamp;

	public ContextParamMap clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextParamMap clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextParamMap clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextParamMap clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextParamMap clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
