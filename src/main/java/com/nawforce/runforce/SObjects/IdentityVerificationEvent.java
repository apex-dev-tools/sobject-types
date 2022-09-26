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
public class IdentityVerificationEvent extends SObject {
	public static SObjectType$<IdentityVerificationEvent> SObjectType;
	public static SObjectFields$<IdentityVerificationEvent> Fields;

	public String Activity;
	public String City;
	public String Country;
	public String CountryIso;
	public Datetime CreatedDate;
	public Datetime EventDate;
	public String EventGroup;
	public String EventIdentifier;
	public Id Id;
	public Decimal Latitude;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public String LoginKey;
	public Decimal Longitude;
	public String Policy;
	public String PostalCode;
	public String Remarks;
	public Id ResourceId;
	public ConnectedApplication Resource;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public String Status;
	public String Subdivision;
	public Id UserId;
	public User User;
	public String Username;
	public String VerificationMethod;

	public IdentityVerificationEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
