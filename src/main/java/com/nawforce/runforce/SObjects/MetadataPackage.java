/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MetadataPackage extends SObject {
	public static SObjectType$<MetadataPackage> SObjectType;
	public static SObjectFields$<MetadataPackage> Fields;

	public Id Id;
	public String Name;
	public String NamespacePrefix;
	public String PackageCategory;
	public Datetime SystemModstamp;

	public MetadataPackageVersion[] MetadataPackageVersions;

	public MetadataPackage clone$() {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
