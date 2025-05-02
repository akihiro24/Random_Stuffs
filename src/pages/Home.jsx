import React from 'react'
import { Link } from 'react-router-dom'
import '../css/Home.css'
import ClubCard from '../components/Card.jsx'

function Home() {
    return (
      <div className='home-container'>

        <h1>Welcome NU Bulldogs, to the Student Club Portal!</h1>
        <h3>Check out organizations from across campuses and explore your interests</h3>

        <div className='club-card-container'>
            <ClubCard name="Paulo" desc="Club1"/>
            <ClubCard name="Kit" desc="Club1"/>
            <ClubCard name="Kevin" desc="Club1"/>
        </div>
        
      </div>
    );
  }

export default Home;