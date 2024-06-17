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
public class CareProgramTeamMemberChangeEvent extends SObject {
	public static SObjectType$<CareProgramTeamMemberChangeEvent> SObjectType;
	public static SObjectFields$<CareProgramTeamMemberChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id CareProgramId;
	public CareProgram CareProgram;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public String Role;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Id UserId;
	public User User;

	public CareProgramTeamMemberChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProgramTeamMemberChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramTeamMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramTeamMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramTeamMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
