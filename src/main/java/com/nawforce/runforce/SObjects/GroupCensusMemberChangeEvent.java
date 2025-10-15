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
public class GroupCensusMemberChangeEvent extends SObject {
	public static SObjectType$<GroupCensusMemberChangeEvent> SObjectType;
	public static SObjectFields$<GroupCensusMemberChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Address Address;
	public Decimal AnnualEligibleSalary;
	public String AssociationWithPrimaryMbr;
	public Date Birthdate;
	public Object ChangeEventHeader;
	public String City;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DependentCount;
	public String Email;
	public String FirstName;
	public Decimal FullTimeEquivalent;
	public String Gender;
	public String GeocodeAccuracy;
	public Id GroupCensusId;
	public GroupCensus GroupCensus;
	public Id GroupClassId;
	public GroupClass GroupClass;
	public Id Id;
	public Boolean IsOptOutAllPlans;
	public Boolean IsPortalUser;
	public Date JoinDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Lastname;
	public Decimal Latitude;
	public Decimal Longitude;
	public String MemberKey;
	public String MemberType;
	public String Name;
	public String OptOutPlanTypes;
	public Id OwnerId;
	public User Owner;
	public String PhoneNumber;
	public Date PolicyStartDate;
	public String PostalCode;
	public Id PrimaryGroupCensusMemberId;
	public GroupCensusMember PrimaryGroupCensusMember;
	public String PrimaryMemberCategory;
	public String PrimaryMemberSource;
	public String RelationshipToPrimaryMember;
	public String ReplayId;
	public String SmokerStatus;
	public String SourceSystemIdentifier;
	public String State;
	public String StateCode;
	public String Status;
	public String Street;

	public GroupCensusMemberChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMemberChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
