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
public class IndividualChangeEvent extends SObject {
	public static SObjectType$<IndividualChangeEvent> SObjectType;
	public static SObjectFields$<IndividualChangeEvent> Fields;

	public Date BirthDate;
	public com.nawforce.runforce.System.Boolean CanStorePiiElsewhere;
	public Object ChangeEventHeader;
	public com.nawforce.runforce.System.Integer ChildrenCount;
	public com.nawforce.runforce.System.Integer ConsumerCreditScore;
	public com.nawforce.runforce.System.String ConsumerCreditScoreProviderName;
	public com.nawforce.runforce.System.Integer ConvictionsCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Date DeathDate;
	public com.nawforce.runforce.System.String FirstName;
	public com.nawforce.runforce.System.Boolean HasOptedOutGeoTracking;
	public com.nawforce.runforce.System.Boolean HasOptedOutProcessing;
	public com.nawforce.runforce.System.Boolean HasOptedOutProfiling;
	public com.nawforce.runforce.System.Boolean HasOptedOutSolicit;
	public com.nawforce.runforce.System.Boolean HasOptedOutTracking;
	public Id Id;
	public com.nawforce.runforce.System.String IndividualsAge;
	public com.nawforce.runforce.System.Integer InfluencerRating;
	public com.nawforce.runforce.System.Boolean IsHomeOwner;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LastName;
	public com.nawforce.runforce.System.String MilitaryService;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String Occupation;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String Salutation;
	public com.nawforce.runforce.System.Boolean SendIndividualData;
	public com.nawforce.runforce.System.Boolean ShouldForget;
	public com.nawforce.runforce.System.String Website;

	public IndividualChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IndividualChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IndividualChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IndividualChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IndividualChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
