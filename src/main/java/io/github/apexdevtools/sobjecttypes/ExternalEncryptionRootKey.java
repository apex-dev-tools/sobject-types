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
public class ExternalEncryptionRootKey extends SObject {
	public static SObjectType$<ExternalEncryptionRootKey> SObjectType;
	public static SObjectFields$<ExternalEncryptionRootKey> Fields;

	public Datetime ActivatedDate;
	public String CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public String LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Region;
	public String RootKeyIdentifier;
	public String RootKeyService;
	public String Status;

	public ExternalEncryptionRootKey clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExternalEncryptionRootKey clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExternalEncryptionRootKey clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExternalEncryptionRootKey clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExternalEncryptionRootKey clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
