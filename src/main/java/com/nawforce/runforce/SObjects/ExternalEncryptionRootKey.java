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
