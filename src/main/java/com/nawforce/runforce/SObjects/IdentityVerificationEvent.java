/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class IdentityVerificationEvent extends SObject {
	public static SObjectType$<IdentityVerificationEvent> SObjectType;
	public static SObjectFields$<IdentityVerificationEvent> Fields;

	public com.nawforce.runforce.System.String Activity;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryIso;
	public Datetime CreatedDate;
	public Datetime EventDate;
	public com.nawforce.runforce.System.String EventGroup;
	public com.nawforce.runforce.System.String EventIdentifier;
	public Id Id;
	public Decimal Latitude;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public com.nawforce.runforce.System.String LoginKey;
	public Decimal Longitude;
	public com.nawforce.runforce.System.String Policy;
	public com.nawforce.runforce.System.String PostalCode;
	public com.nawforce.runforce.System.String Remarks;
	public Id ResourceId;
	public ConnectedApplication Resource;
	public com.nawforce.runforce.System.String SessionKey;
	public com.nawforce.runforce.System.String SessionLevel;
	public com.nawforce.runforce.System.String SourceIp;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String Subdivision;
	public Id UserId;
	public User User;
	public com.nawforce.runforce.System.String Username;
	public com.nawforce.runforce.System.String VerificationMethod;

	public IdentityVerificationEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
