/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataEncryptionKey extends SObject {
	public static SObjectType$<DataEncryptionKey> SObjectType;
	public static SObjectFields$<DataEncryptionKey> Fields;

	public String CreatedBy;
	public Datetime CreatedDate;
	public String DataEncryptionKeyCertName;
	public String Description;
	public Boolean DoesUseKeyDerivation;
	public String ExternalId;
	public Id Id;
	public String LastModifiedBy;
	public Datetime LastModifiedDate;
	public String RootKeyIdentifier;
	public String RootKeyKmsIdentifier;
	public String SecretValue;
	public String SessionToken;
	public String Source;
	public String Status;
	public String Type;
	public Integer Version;

	public DataEncryptionKey clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataEncryptionKey clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataEncryptionKey clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataEncryptionKey clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataEncryptionKey clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
