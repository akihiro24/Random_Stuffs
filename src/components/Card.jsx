import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

function ClubCard({name, desc}) {
  return (
    <Card className="club-card" style={{ width: '18rem' }}>
      <Card.Img variant="top" src="{holder.js/100px180}" />
      <Card.Body>
        <Card.Title>{name}</Card.Title>
        <Card.Text>
          {desc}
        </Card.Text>
        <Button variant="primary">Explore</Button>
      </Card.Body>
    </Card>
  );
}

export default ClubCard;