/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ChatterExtensionConfig extends SObject {
	public static SObjectType$<ChatterExtensionConfig> SObjectType;
	public static SObjectFields$<ChatterExtensionConfig> Fields;

	public Boolean CanCreate;
	public Boolean CanRead;
	public Id ChatterExtensionId;
	public ChatterExtension ChatterExtension;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer Position;
	public Datetime SystemModstamp;

	public ChatterExtensionConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtensionConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtensionConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtensionConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtensionConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
