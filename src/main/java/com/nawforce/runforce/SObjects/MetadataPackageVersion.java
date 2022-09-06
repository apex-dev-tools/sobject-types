/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MetadataPackageVersion extends SObject {
	public static SObjectType$<MetadataPackageVersion> SObjectType;
	public static SObjectFields$<MetadataPackageVersion> Fields;

	public Integer BuildNumber;
	public Id Id;
	public Boolean IsDeprecated;
	public Integer MajorVersion;
	public Id MetadataPackageId;
	public MetadataPackage MetadataPackage;
	public Integer MinorVersion;
	public String Name;
	public Integer PatchVersion;
	public String ReleaseState;
	public Datetime SystemModstamp;

	public PackagePushRequest[] PackagePushRequests;
	public PackageSubscriber[] PackageSubscribers;

	public MetadataPackageVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackageVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackageVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackageVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackageVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
