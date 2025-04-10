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
public class HealthcareProviderServiceShare extends SObject {
	public static SObjectType$<HealthcareProviderServiceShare> SObjectType;
	public static SObjectFields$<HealthcareProviderServiceShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public HealthcareProviderService Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public HealthcareProviderServiceShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderServiceShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderServiceShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderServiceShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderServiceShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
